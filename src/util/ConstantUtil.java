package util;

public interface ConstantUtil {
    enum RentType {
        DAY,
        MONTH,
        YEAR
    }

    enum RoomType {
        STANDARD,
        SUPERIOR,
        DELUXE,
        SUITE,
        PRESIDENTIAL
    }

    enum TypeCustomer{
        DIAMOND,
        PLATINIUM,
        GOLD,
        SILVER,
        MEMBER
    }

    enum Degree{
        INTERMEDIATE,
        ASSOCIATE,
        BACHERLOR,
        MASTER,
        DOCTER,
        PROFESSOR
    }

    enum Position{
        Receptionist,
        ATTENDANT,
        SUPERVISOR,
        SECURITY,
        HR,
        SALES,
        DIRECTOR,
        CHEF,
        MANAGER
    }

    enum Gender{
        MALE,
        FEMALE,
        UNKNOW
    }
}
