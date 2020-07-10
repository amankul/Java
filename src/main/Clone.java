package main;

/*
Marker(empty) interfaces in java - Cloneable, Serializable etc
If Class implements Cloneable then its instances can use clone method to make field-field copy
Similarly serializable makes object eligible for saving its state to file
*/

 class Clone implements Cloneable{

    int i;
    String s;

    public Clone(int i,String s)
    {
        this.i = i;
        this.s = s;
    }

 public Object clone () throws CloneNotSupportedException {               // over-ride Object.clone()
        return super.clone();

}

    public static void main(String[] args) throws CloneNotSupportedException {

        Clone clone1 = new Clone(20, "Geek");               // if clone1 = clone2 then object is not clones, only reference is

        Clone clone2 = (Clone) clone1.clone();                        // clone method returns object, hence casting needed

        System.out.println(clone2.i);
        System.out.println(clone2.s);
    }


}










	
