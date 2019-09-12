#include <SPI.h>
#include <MFRC522.h>

#define RST_PIN         9           // Configurable, see typical pin layout above
#define SS_PIN          10          // Configurable, see typical pin layout above

MFRC522 mfrc522(SS_PIN, RST_PIN);   // Create MFRC522 instance

void setup() {
  Serial.begin(9600);        // Initialize serial communications with the PC
  SPI.begin();               // Init SPI bus
  mfrc522.PCD_Init();        // Init MFRC522 card
  pinMode(6, INPUT);         // pino de leitura
  Serial.println("Mantenha o cartao em cima do leitor para realizar o procedimento\n");
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

  /* Gravar dados */
  if (digitalRead(6) == 0) {
    Serial.println(F("\n--------- Consultório Médico --------- \n"));
    Serial.print(F( "CARTAO ID:"));    //Dump UID
    for (byte i = 0; i < mfrc522.uid.size; i++) {
      Serial.print(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " ");
      Serial.print(mfrc522.uid.uidByte[i], HEX);
    }
    Serial.println("");

    byte buffer[34];
    byte block;
    MFRC522::StatusCode status;
    byte len;

    Serial.setTimeout(20000L) ;     // wait until 20 seconds for input from serial
    // Ask personal data: remedio
    Serial.println(F("Nome do remedio, terminando com #"));
    len = Serial.readBytesUntil('#', (char *) buffer, 30) ; // read remedio from serial
    for (byte i = len; i < 30; i++) buffer[i] = ' ';        // pad with spaces

    block = 1;
    status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, block, &key, &(mfrc522.uid));
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("\nProcesso falhou, tente novamente! "));
      return;
    }
    else Serial.println(F("Processo validado! "));

    // Write block
    status = mfrc522.MIFARE_Write(block, buffer, 16);
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo falhou!! Tente novamente "));
      return;
    }
    else

      block = 2;
    status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, block, &key, &(mfrc522.uid));
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo falhou, tente novamente! "));
      return;
    }

    // Write block
    status = mfrc522.MIFARE_Write(block, &buffer[16], 16);
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo falhou, tente novamente! "));
      return;
    }
    else
      Serial.println(F("Dosagem, terminando com #"));
    len = Serial.readBytesUntil('#', (char *) buffer, 20) ; // read first name from serial
    for (byte i = len; i < 20; i++) buffer[i] = ' ';        // pad with spaces

    block = 4;
    status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, block, &key, &(mfrc522.uid));
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo falhou, tente novamente!"));
      return;
    }

    // Write block
    status = mfrc522.MIFARE_Write(block, buffer, 16);
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo falhou, tente novamente! "));
      return;
    }
    else

      block = 5;
    status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, block, &key, &(mfrc522.uid));
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo falhou, tente novamente! "));
      return;
    }

    // Write block
    status = mfrc522.MIFARE_Write(block, &buffer[16], 16);
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo falhou, tente novamente! "));
      return;
    }
    else Serial.println(F("\n---------Processo validado, Retire seu cartao---------\n "));
    Serial.println(" ");
  }
  /* Leitura de Dados */
  else if (digitalRead(6) == 1) {
    Serial.println(F("--------- Farmácia ---------\n"));
    Serial.println(F("Cartao encontrado e validado!"));
    Serial.print(F("Dosagem: "));

    byte buffer1[18];

    block = 4;
    len = 18;

    status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, 4, &key, &(mfrc522.uid)); //line 834 of MFRC522.cpp file
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Procedimento falhou, tente novamente!! "));
      return;
    }

    status = mfrc522.MIFARE_Read(block, buffer1, &len);
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Falha na leitura, tente novamente!! "));
      return;
    }

    //PRINT FIRST NAME
    for (uint8_t i = 0; i < 16; i++)
    {
      if (buffer1[i] != 32)
      {
        Serial.write(buffer1[i]);
      }
    }
    Serial.println("");

    byte buffer2[18];
    block = 1;

    status = mfrc522.PCD_Authenticate(MFRC522::PICC_CMD_MF_AUTH_KEY_A, 1, &key, &(mfrc522.uid)); //line 834
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Processo invalido! "));
      return;
    }

    status = mfrc522.MIFARE_Read(block, buffer2, &len);
    if (status != MFRC522::STATUS_OK) {
      Serial.print(F("Falha de leitura!! "));
      return;
    }

    //PRINT LAST NAME
    Serial.println("Nome do remedio: ");
    for (uint8_t i = 0; i < 16; i++) {
      Serial.write(buffer2[i] );
    }

    Serial.println(F("\n---------Processo Finalizado---------\n"));
  }

  delay(1000);                //change value if you want to read cards faster
  mfrc522.PICC_HaltA();       // Halt PICC
  mfrc522.PCD_StopCrypto1();  // Stop encryption on PCD
  
}
