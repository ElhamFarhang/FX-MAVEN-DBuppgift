module org.example.fxmavendbuppgift {
    requires javafx.controls;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.desktop;

//    opens org.example.fxmavendbuppgift.entities to org.hibernate.orm.core;
    exports org.example.fxmavendbuppgift;
}