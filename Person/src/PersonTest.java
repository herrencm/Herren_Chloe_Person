import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1, p2, p3, p4, p5, p6;
    @BeforeEach
    void setUp(){
        p1 = new Person ("00000A", "Chloe","Herren","Ms.",2003);
        p2 = new Person ("00000B", "Jim","Tester1","Mr.",1998);
        p3 = new Person ("00000C","Bill","Tester2","Mr.",1995);
        p4 = new Person ("00000D","Kim","Tester3","Mrs.",1992);
        p5 = new Person ("00000E","Sarah","Tester4","Mrs.",1999);
        p6 = new Person ("00000F","Brandon","Tester5","Mr.",2001);
    }

    @org.junit.jupiter.api.Test
    void setID() {
        assertEquals("00000A", p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {assertEquals("Chloe", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {assertEquals("Herren", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {assertEquals("Ms.", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {assertEquals(2003, p1.getYOB());
    }
}