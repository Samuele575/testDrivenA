package it.isa.tests;

public class Operations {
    private int operationCounter;
    private ServerInterface si;

    public Operations(){
        operationCounter = 0;
    }

    public Operations(int operationCounter) {
        this.operationCounter = operationCounter;
    }

    public Operations(ServerInterface si) {
        this.si = si;
    }

    public float sum(Float a, Float b){
        operationCounter++;
        return a+b;
    }

    public int getCount() {
        return operationCounter;
    }

    public boolean positivi(int a, int b) {
        if(a > 0 && b > 0){
            return true;
        } else {
            return false;
        }
    }

    public int getServerStatus() {
        return this.si.getStatus();
    }

    public String getURL(String serviceName, String status){
        return this.si.getURL(serviceName, status);
    }

    public float divisione(float a, float b){
        return a/b;
    }

    public int sumInt(int a, int b){
        long res = (long) a+b;
        if(res > java.lang.Integer.MAX_VALUE){
            System.out.println("i 2 numeri eccedono la memoria istanziata: atteso errore di Overflow");
        }
        operationCounter++;
        return (int)res;
    }

}
