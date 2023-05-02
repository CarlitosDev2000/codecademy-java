package practicandoarraysyloops;

public class main {

        public static void main(String[] args) {
            int [][] multi = {
                    {1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15}
            };

            int x = multi.length -1; //2
            int y = multi[x].length-1; //4
            System.out.println(multi[x][y]);
        }
    }

