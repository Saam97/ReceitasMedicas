#include <SPI.h>
#include <MFRC522.h>

#define RST_PIN         9           // Configurable, see typical pin layout above
#define SS_PIN          10          // Configurable, see typical pin layout above
#define LED             13          // LED

MFRC522 mfrc522(SS_PIN, RST_PIN);   // Create MFRC522 instance

void setup() {

  pinMode(LED, OUTPUT);      // LED auxiliar
  Serial.begin(9600);        // Initialize serial communications with the PC
  SPI.begin();               // Init SPI bus
  mfrc522.PCD_Init();        // Init MFRC522 card

}

void loop() {

  // Prepare key - all keys are set to FFFFFFFFFFFFh at chip delivery from the factory.
  MFRC522::MIFARE_Key key;
  for (byte i = 0; i < 6; i++) key.keyByte[i] = 0xFF;

  //some variables we need
  byte block;
  byte len;
  MFRC522::StatusCode status;

  // Look for new cards
  if ( ! mfrc522.PICC_IsNewCardPresent()) {
    return;
  }

  // Select one of the cards
  if ( ! mfrc522.PICC_ReadCardSerial()) {
    return;
  }

  /** Leitura dos dados **/
  digitalWrite(LED, HIGH);      // Quando encontrar o cartão, acende o led

  // Variaveis auxiliares
  byte buffer1[18];
  block = 4;
  len = 18;

  /* DOSAGEM DO REMÉDIO */

  /* Validação de leitura */
  status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, 4, &key, &(mfrc522.uid)); //line 834 of MFRC522.cpp file
  if (status != MFRC522::STATUS_OK) {
    //Serial.println(F("Procedimento falhou, tente novamente!! \n"));
    Serial.write("Procedimento falhou, tente novamente !\n");
    return;
  }

  /* Validação de leitura */
  status = mfrc522.MIFARE_Read(block, buffer1, &len);
  if (status != MFRC522::STATUS_OK) {
    //Serial.println(F("Falha na leitura, tente novamente!! \n"));
    Serial.write("Falha na leitura, tente novamente ! \n");
    return;
  }

  int tam = 0;
  /* Descobrindo o tamanho da palavra da Dosagem */
  for (uint8_t i = 0; i < 16; i++) {
    if (buffer1[i] != 32) {
      tam++;
    }
  }

  // Criando a variável
  byte dosagem[tam];
  
  // Atribuindo somente os valores necessários
  for ( uint8_t i = 0; i < tam; i++) {
    dosagem[i] = buffer1[i];
  }

  /* NOME DO REMÉDIO */

  // Variáveis auxiliares
  byte buffer2[18];
  block = 1;

  /* Validação de leitura */
  status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, 1, &key, &(mfrc522.uid)); //line 834
  if (status != MFRC522::STATUS_OK) {
    Serial.print(F("Processo invalido! "));
    return;
  }

  /* Validação de leitura */
  status = mfrc522.MIFARE_Read(block, buffer2, &len);
  if (status != MFRC522::STATUS_OK) {
    Serial.print(F("Falha de leitura!! "));
    return;
  }

  int tam2 = 0;
  /* Tamanho da variável de nome do remédio */
  for (uint8_t i = 0; i < 16; i++) {
    tam2++;
  }

  /* Atribuindo valor a variável com o nome do remédio */
  byte remedio[tam2];
  for ( uint8_t i = 0; i <  tam2; i++) {
    remedio[i] = buffer2[i];
  }

  /* Saida de dados */
  // Printa os valores
  Serial.write( (char*) dosagem );
  Serial.write( (char*) remedio );
  
  // Desliga o LED
  digitalWrite(LED, LOW);

  delay(1000);                //change value if you want to read cards faster
  mfrc522.PICC_HaltA();       // Halt PICC
  mfrc522.PCD_StopCrypto1();  // Stop encryption on PCD

}
