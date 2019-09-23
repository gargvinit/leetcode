class Solution {
    private static class Pair{
        private int x;
        private int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public boolean equals(Object o){
            Pair p = (Pair)o;
            return p.x == x && p.y == y;
        }
        public int hashCode() {
            return x*718 + y*213;
        }
    }
    public int minKnightMoves(int x, int y) {
       int[][] updates= new int[][]{new int[]{1,2},new int[]{-1,2},new int[]{-1,-2},new int[]{1,-2},new int[]{2,1},new int[]{2,-1},new int[]{-2,1},new int[]{-2,-1}};
        Queue<List<Integer>> queue = new LinkedList<>();
        Set<Pair> visited = new HashSet<>();
        visited.add(new Pair(0,0));
        queue.add(Arrays.asList(0,0,0));
        while(!queue.isEmpty()){
            List<Integer> p = queue.remove();
            if(p.get(0)== x && p.get(1) == y) return p.get(2);
            for(int[] update: updates){
                int nx = p.get(0)+update[0];
                int ny = p.get(1)+update[1];
                if(!visited.contains(new Pair(nx,ny))){
                    visited.add(new Pair(nx,ny));
                    if((nx-x)*(nx-x) + (ny-y)*(ny-y) <= x*x + y*y){
                        queue.add(Arrays.asList(nx,ny,p.get(2)+1));
                    }
                }
            }
        }
        return -1;
    }
}
