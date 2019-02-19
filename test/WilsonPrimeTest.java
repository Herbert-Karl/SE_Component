class WilsonPrimeTest {
    @Test
    void execute () {

        BigInteger from = BigInteger.valueOf(10);
        BigInteger to = BigInteger.valueOf(15);
        ArrayList<BigInteger> wilsonPrimes = new ArrayList<BigInteger>();

        WilsonPrime wilsonPrime = WilsonPrime.getInstance();
        wilsonPrimes = wilsonPrime.port.execute(from, to);
        ArrayList<BigInteger> resultArray = new ArrayList<BigInteger>();
        BigInteger resultBi = BigInteger.valueOf(13);
        resultArray.add(resultBi);
        assertEquals(resultArray, wilsonPrimes);


        BigInteger from2 = BigInteger.valueOf(540);
        BigInteger to2 = BigInteger.valueOf(570);
        ArrayList<BigInteger> wilsonPrimes2 = new ArrayList<BigInteger>();

        WilsonPrime wilsonPrime2 = WilsonPrime.getInstance();
        wilsonPrimes = wilsonPrime.port.execute(from2, to2);

        ArrayList<BigInteger> resultArray2 = new ArrayList<BigInteger>();
        BigInteger resultBi2 = BigInteger.valueOf(563);
        resultArray2.add(resultBi2);
        assertEquals(resultArray2, wilsonPrimes);
    }
}