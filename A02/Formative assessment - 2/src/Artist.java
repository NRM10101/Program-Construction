public  class Artist{
    private String name;

    Artist(String name){
        System.out.println("This is the constructor Artist() in the class Artist");
        this.name=name;
    }
    public String getName(){
        System.out.println("This is the method getName() in the Artist");
        return this.name;
    }
    void setName(String name){
        System.out.println("This is the method getName() in the Artist");
        this.name=name;
    }
}
