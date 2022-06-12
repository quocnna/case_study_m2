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
        PLATINUM,
        GOLD,
        SILVER,
        MEMBER
    }

    enum Degree{
        INTERMEDIATE,
        ASSOCIATE,
        BACHELOR,
        MASTER,
        DOCTOR,
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
        UNKNOWN
    }

    interface PROMOTION{
        Integer TEN_PERCENT = 10;
        Integer TWENTY_PERCENT = 20;
        Integer FIFTY_PERCENT = 50;
    }
}
