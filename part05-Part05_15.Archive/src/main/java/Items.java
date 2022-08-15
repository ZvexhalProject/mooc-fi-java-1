
public class Items {
   
        private String identifier;
        private String name;
    
        public Items(String identifier, String name){
            this.identifier=identifier;
            this.name=name;
        }
    
        public boolean equals(Object compare){
            if(this==compare){
                return true;
            }
            if(!(this instanceof Items)){
                return false;
            }
    
            Items compareItem=(Items)compare;
            if(this.identifier.equals(compareItem.identifier)){
                return true;
            }
            return false;
        }
        
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return this.identifier+": "+this.name;
        }
  
}
