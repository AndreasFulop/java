public class M5_11EqualsGood {
    public static void main(String[] args) {
        Robots AI1 = new Robots (1);
        Robots AI2 = new Robots (1);
        //Despite having two objects with the same name, the equality testing returns false, because we have two different objects (two different references or memory locations).
        System.out.println(AI1.equals(AI2));
                }
            }
        
    class Robots{
                int id;
                 Robots (int i) {
                    id = i;
                 }
            @Override
            public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Robots other = (Robots) obj;
            if (id != other.id)
                return false;
            return true;
        }
    }