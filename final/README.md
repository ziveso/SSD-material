# FINAL REVIEW BY GUY NGI JA KAI RA


# Null Object Design Pattern

- ใช้เพื่อกันระบบล่ม แทนที่จะให้มัน throw Exception ออกมาให้มัน return Object ที่ไม่มีประโยชน์ออกมาแทน
    - ข้อดี
        - โปรแกรมรันต่อได้
    - ข้อเสีย
        - สมมุติว่า A โอนเงินไป B แล้ว B เป็น null Object เงินก็จะหายไปเลย

- UML TODO ##

# Iterator Design Parrern

- ไม่มีเหรี้ยไร ก็ JIM ไง
    ``` 
    new Iterator<DATATYPE>() {

        var pointer = 0

        hasNext {
            
        }
        next {

            point ++

        }

    } 
    ```

    - ใช้แทน loop ซะส่วนมาก

- UML TODO ##

# Comparator & Sorting (ไม่ออก)

- การเขียน comparator JIM Again
    ```
    new Comparator<DATATYPE>() {

        compareTo(o1 , o2) {

            return o2-o1

        }

    }
    ```

- UML TODO ##

# Command Design Pattern

- เอาไว้เก็บ action ซะส่วนใหญ่ ส่วนมากจะเอาไว้ทำ replay
    - สร้าง Interface (ACTION)
    - MOVEUP ACTION implements ACTION
    - เก็บ List<ACTION>
    - เอา ACTION นั้นมา Execute

- UML TODO ##

# Builder Design Pattern (ไม่ออก)

- ใช้แก้ปัญหา contructor ใส่ params ยาวๆ เยอะๆ

- UML TODO ##

# State Machine Design Pattern

- JIMMY AGAIN

- UML TODO ##

# Object Pool Design Pattern

- ใช้แก้ปัญหา create and remove object บ่อยๆ การทำ 2 อย่างนี้มันเปลื่อง memory มากๆ
- ทำให้การที่ create object เยอะๆไว้ที่นึงก่อนแล้วเรียกมาใช้ เรื่อยๆ จะดีกว่า 

- UML TODO ##

# Decorator Design Pattern

- ใช้ง่าย โย บอก
- ทำลายน้ำ ใช้ทำไรก็ไม่รู็เหมือนกัน

- UML TODO ##

# Memento Design Pattern

- ใช้เพื่อ save ค่าที่เป็น private ใน class นั้น แล้ว load มาใช้

- UML TODO ##

# Grasp

## Low Coupling

## Polymorpism

## Pure Fabrication

## Protected Variation

## Indirection

# Liskov Substitution

# Dependency Inversion






