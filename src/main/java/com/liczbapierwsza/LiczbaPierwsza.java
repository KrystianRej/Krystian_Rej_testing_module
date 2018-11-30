package com.liczbapierwsza;

public class LiczbaPierwsza {
    public int liczbaPierwsza(int liczba) {
        int count = 0;
        int primeNumber = 2;
        while(count != liczba) {
            if(isPrimeNumber(primeNumber)) {
                count++;
            }
            primeNumber++;
        }
        return --primeNumber;
    }
    public boolean isPrimeNumber(int liczba) {
        for (int i = 2; i <= liczba/2; i++) {
            if(liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LiczbaPierwsza l = new LiczbaPierwsza();
        long start = System.nanoTime();
        int k = l.liczbaPierwsza(10000);
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(k);
    }
}
