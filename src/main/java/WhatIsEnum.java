/*
An enum is a special "class" that represents a group of constants e.g days of week, suits in deck etc
Enums are used when we know all possible values at compile time
An enum can, just like a class, have attributes and methods.
The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
 */

enum EnumDay {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;

     EnumDay() {

        System.out.println("Constructor called for : " + this.toString());
    }


    private void dayLevel() {

        System.out.println("UNIVERSAL" );
    }

    public static void main(String[] args)
    {
    EnumDay d1 = EnumDay.FRIDAY;                    // constructor called for each enum const. Enum can't be instantiated.
        EnumDay d2 = EnumDay.valueOf("TUESDAY");

        System.out.println(d1 + " " + d2  );        //d1 is enum object whose value get converted to string



        // values method returns all values

        for(EnumDay e: EnumDay.values()) {
            switch(e) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(e.ordinal());        // ordinal returns index
                    break;
                default:
                    continue;
            }

        }


    }


}
