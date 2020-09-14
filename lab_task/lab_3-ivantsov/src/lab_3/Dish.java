package lab_3;


public abstract class Dish {
        private boolean broken;
        private int weight;

        public Dish(boolean broken,int weight) {
            this.broken = broken;
            this.weight =weight ;
        }

        public abstract void breaken();

        public boolean isBroken() {
            return broken;
        }

        public void setBroken(boolean broken) {
            this.broken = broken;
        }

        public int getWeight() {
         return weight;
         }

        public void setWeight(int weight) {
            this.weight = weight;
        }

    @Override
        public String toString() {
            return "Dish {" +
                    "broken='" + broken + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

