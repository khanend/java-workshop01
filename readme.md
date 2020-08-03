## workshop-java-01
## Circular buffer
## 1. Data structure ? (Internal)
 * Array of String
## 2. Operations/Behavior/Methods ? user -> CB ?
writeData(string):void

readData(): string

isFull(): boolean

isEmpty(): boolean

setSize(int): void

## 3. Internal process ?
  * buffer size = 10 (default)
  * read pointer = 0
  * write pointer = 0
## List of test cases
  * TC01 => read ไม่มากกว่า write
  * TC02 => การ write ครั้งที่ 11 จะแทนที่ด้วยตัวที่เก่าที่สุดหรือตัวแรก ใน buffer 
  * TC03 => การ read  จะไม่ถูก read เมื่อตัวที่ read เป็นค่า null หรือไม่มีค่า
  * TC04 => เช็คจำนวนช่องใน buffer ว่ามี 10 ช่อง
  * TC05 => เช็คจำนวนช่องใน buffer ว่าเต็มแล้ว
  * TC06 => เช็คจำนวนช่องใน buffer ที่สร้างขึ้นว่าเป็นค่าว่าง
  * TC07 => ตัวอักษรที่ write ใน buffer ต้อง read ถูกต้องเช่น write เป็น A ต้อง read ได้ A

  
  

  
