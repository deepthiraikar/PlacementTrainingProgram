public class AmountException extends RuntimeException{
        public AmountException(){
            super("Invalid amount");
        }
        public AmountException(String msg){
            super(msg);
        }
}