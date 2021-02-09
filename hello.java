class hello {
    public static void main(String[] args) {

        System.out.println(solutionFirst());

        System.out.println(SumDivisibleBy(3) + SumDivisibleBy(5) - SumDivisibleBy(15));
    }
     static int SumDivisibleBy(int n){
        int max = 999;
        return n*(max /n)*((max /n)+1)/2;
    }

    static int solutionFirst() {
        int sum = 0;
        for(int i=1; i<1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
