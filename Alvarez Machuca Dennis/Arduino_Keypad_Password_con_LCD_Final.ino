#include <Wire.h>
#include <Password.h> //Incluimos la libreria Password
#include <Keypad.h> //Incluimos la libreria Keypad 
#include <LiquidCrystal_I2C.h>  //Incluimos la libreria LiquidCrystal_I2V
#include <Servo.h> //Incluimos la libreria Servo

#define I2C_ADDR    0x3F //Declaramos el formato para el Display
LiquidCrystal_I2C   lcd(I2C_ADDR,2, 1, 0, 4, 5, 6, 7);

//Definimos los grados en los que se va a posicionar el Servomotor
#define cerrar 60
#define abrir 180            

//Creamos un objeto servo que va a servir para el desbloqueo de la compuerta
Servo seguro;                                             

Password password = Password("25082");  //Definimos el Password
int dlugosc = 5;                        //Largo del Password

//Creamos las Variables de salida
int buzzer = 10; 
int ledRed = 11; 
int ledGreen = 12;
int LCD_Luz = 1;
 
int ilosc; //Numero de Clicks
 
const byte ROWS = 4; // Cuatro Filas
const byte COLS = 4; // Cuatro Columnas

// Definimos el Keymap
char keys[ROWS][COLS] = {
  {'1','2','3','A'},
  {'4','5','6','B'},
  {'7','8','9','C'},
  {'*','0','#','D'}
};

byte rowPins[ROWS] = { 9,8,7,6 };// Conectar los keypads ROW1, ROW2, ROW3 y ROW4 a esos Pines de Arduino.
byte colPins[COLS] = { 5,4,3,2 };// Conectar los keypads COL1, COL2, COL3 y COL4 a esos Pines de Arduino.
 
Keypad keypad = Keypad( makeKeymap(keys), rowPins, colPins, ROWS, COLS );
 
void setup()
{
  Serial.begin(9600);
  keypad.addEventListener(keypadEvent);  
  pinMode(ledRed, OUTPUT);  
  pinMode(ledGreen, OUTPUT);
  pinMode(buzzer, OUTPUT);
  seguro.attach(13);
  seguro.write(cerrar);
 
  digitalWrite(ledRed, HIGH);
  digitalWrite(ledGreen, LOW);
 
  lcd.begin(16, 2);
  lcd.setBacklightPin(3,POSITIVE);
  lcd.setBacklight(HIGH);
  lcd.setCursor(0,0);
  lcd.print("***Bienvenido***");
  lcd.setCursor(0,1);
  lcd.print("Inserte el PIN:");
}
 
void loop()
{
  keypad.getKey();
}
void keypadEvent(KeypadEvent eKey)
{
  switch (keypad.getState())
  {
    case PRESSED:
   
int i;
for( i = 1; i <= 1; i++ )
{
  tone(buzzer,375);  // tono de pulsacion
  delay(200);
  noTone(buzzer);
  /*
  digitalWrite(buzzer, HIGH);  
  delay(200);            
  digitalWrite(buzzer, LOW);  
  delay(100);
  */      
}    
 
Serial.print("Pressed: ");
Serial.println(eKey);
 
switch (eKey)
{
case '#':
if(LCD_Luz%2==0){
  lcd.setBacklight(LOW);
  LCD_Luz += 1;
  }
break;
/* 
case '*':
break;
*/
ilosc = 0;  
    password.reset();
 
    Serial.println("Reset");
 
    digitalWrite(ledGreen, LOW);
    digitalWrite(ledRed, HIGH);    

    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("***Bienvenido***");
    lcd.setCursor(0,1);
    lcd.print("Inserte el PIN:");
break;
 
default:
ilosc=ilosc+1;
password.append(eKey);
}
//Serial.println(ilosc);
 
if(ilosc == 1)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("*_");
}
if(ilosc == 2)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("**_");
}
if(ilosc == 3)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("***_");
}
if(ilosc == 4)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("****_");
}
if(ilosc == 5)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("*****_");
}
if(ilosc == 6)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("******_");
}
if(ilosc == 7)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("*******_");
}
if(ilosc == 8)
{
lcd.clear();
lcd.setCursor(1,0);
lcd.print("   < PIN >");
lcd.setCursor(0,1);
lcd.print("********");
}
 
if(ilosc == dlugosc)
{
delay(250);
checkPassword();
ilosc = 0;
}
}
}
 
void checkPassword()
{
  if (password.evaluate())
  {
int i;
for( i = 1; i <= 3; i++ )
{
  tone(buzzer,375);
  delay(120);
  noTone(buzzer);
  delay(70);
  /*
  digitalWrite(buzzer, HIGH);  
  delay(120);            
  digitalWrite(buzzer, LOW);  
  delay(70);
  */      
}    
    ilosc = 0;
    password.reset();
    
    Serial.println("Correcto");
    seguro.write(abrir);
    delay(500);    
 
    digitalWrite(ledRed, LOW);
    digitalWrite(ledGreen, HIGH);
    
    lcd.clear();
    lcd.setCursor(0,1);
    lcd.print("<<PIN CORRECTO>>"); 
 
    delay(10000);
    digitalWrite(ledGreen, LOW);
    digitalWrite(ledRed, HIGH);
    seguro.write(cerrar);    
       
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("***Bienvenido***");
    lcd.setCursor(0,1);
    lcd.print("Inserte el PIN:");   
 
  }  
  else  
  {
int i;
for( i = 1; i <= 1; i++ )
{
  tone(buzzer,375);
  delay(300);
  noTone(buzzer);
  delay(100);
  /*
  digitalWrite(buzzer, HIGH);  
  delay(300);            
  digitalWrite(buzzer, LOW);  
  delay(100);
  */      
}  
    ilosc = 0;  
    password.reset();
 
    Serial.println("Error");
 
    digitalWrite(ledGreen, LOW);
    digitalWrite(ledRed, HIGH);    
             
    lcd.clear();
    lcd.setCursor(0,1);
    lcd.print("<<PIN ERRONEO>>");
    delay(2000);
   
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("***Bienvenido***");
    lcd.setCursor(0,1);
    lcd.print("Inserte el PIN:");    
  }
}
