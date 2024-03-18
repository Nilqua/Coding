class SimpleMath {
    public double[] input;
    public double findMaxInArray (double[] input){
        double max = Double.MIN_VALUE;
        for (int i=0; i<input.length; i++){
            if (Math.max(max, input[i]) > max){
                max = input[i];
            }
        }
        return max;
    }
}