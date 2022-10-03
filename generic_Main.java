
class generic_Main {
    public static void main(String[] args)
    {
        generic_Student<String> str_age = new generic_Student<String>("My age is");
        System.out.println(str_age.getObject());

        generic_Student<Integer> age = new generic_Student<Integer>(21 );
        System.out.println( age.getObject());
  

        generic_Student<String> name = new generic_Student<String>("My name is Christian Msa");
        System.out.println(name.getObject());
    }
}