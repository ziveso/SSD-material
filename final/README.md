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
    - new Iterator<DATATYPE>() {

        var pointer = 0

        hasNext {
            
        }
        next {

            point ++

        }

    }
    - ใช้แทน loop ซะส่วนมาก

- UML TODO ##

# Comparator & Sorting (ไม่ออก)

- การเขียน comparator JIM Again
    - new Comparator<DATATYPE>() {

        compareTo(o1 , o2) {

            return o2-o1

        }
        
    }

- UML TODO ##

# Command Design Pattern

- เอาไว้เก็บ action ซะส่วนใหญ่ ส่วนมากจะเอาไว้ทำ replay
    - สร้าง Interface (ACTION)
    - MOVEUP ACTION implements ACTION
    - เก็บ List<ACTION>
    - เอา ACTION นั้นมา Execute

- UML TODO ##

# Builder Design Pattern (ไม่ออก)

# State Machine Design Pattern

# Object Pool Design Pattern

# Decorator Design Pattern

# Memento Design Pattern

# Grasp

## Low Coupling

## Polymorpism

## Pure Fabrication

## Protected Variation

## Indirection

# Liskov Substitution

# Dependency Inversion






