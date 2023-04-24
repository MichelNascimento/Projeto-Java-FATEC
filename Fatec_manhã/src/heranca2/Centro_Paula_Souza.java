package heranca2;

    public class Centro_Paula_Souza{
        private String Fatec;
        private String cidade;
    
        public Centro_Paula_Souza(String cidade){
            this.cidade = cidade;
            System.out.println("método construtor da superclasse\n" + "cidade: " + cidade);
        }
    
        public String getFatec() {
            return Fatec;
        }
    
        public void setFatec(String fatec) {
            Fatec = fatec;
    }    
}   
    

