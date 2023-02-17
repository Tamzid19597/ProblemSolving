package MapHashMapAndHashSet;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashMap<k,v> {
    private class Node{
        private k key;
        private v value;

        public Node(k key, v value) {
            this.key = key;
            this.value = value;
        }
    }
    private int n;  // number of nodes
    private int N;  // array size
    private LinkedList<Node>[] data;

    public CustomHashMap() {
        this.n=0;
        this.N=4;
        data=new LinkedList[this.N];
        for (int i = 0; i < N; i++) {
            data[i]=new LinkedList<>();
        }
    }

    public void put(k key,v value){
        int di=hashFunction(key,N);
        int lli=searchInLL(key,di);
        if (lli==-1){
            data[di].add(new Node(key, value));
            n++;
        }
        else {
            data[di].get(lli).value=value;
        }
        if (n/N>2.00)reHash(data);
    }
    public v get(k key){
        int di=hashFunction(key,N);
        int lli=searchInLL(key,di);
        if (lli==-1){
            return null;
        }
        else return data[di].get(lli).value;
    }
    public boolean containsKey(k key){
        int di=hashFunction(key,N);
        int lli=searchInLL(key,di);
        if (lli==-1){
            return false;
        }
        else return true;
    }
    public v remove(k key){
        int di=hashFunction(key,N);
        int lli=searchInLL(key,di);
        if (lli==-1){
            return null;
        }
        else{
            Node removed=data[di].get(lli);
            data[di].remove(lli);
            n--;
            return removed.value;
        }
    }
    public ArrayList<k> keySet(){
        ArrayList<k> keys=new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].size(); j++) {
                keys.add(data[i].get(j).key);
            }
        }
        return keys;
    }
    private int searchInLL(k key,int di){
        for (int i = 0; i < data[di].size(); i++) {
            if (data[di].get(i).key==key)return i;
        }
        return -1;
    }
    private int hashFunction(k key,int N){
        int di= (Math.abs(key.hashCode()))%N;
        return di;
    }
    private void reHash(LinkedList<Node>[]data){
        LinkedList<Node>[]oldData=data;
        data=new LinkedList[data.length*2];
        for (int i = 0; i < oldData.length; i++) {
            for (int j = 0; j < oldData[i].size(); j++) {
                this.put(oldData[i].get(j).key,oldData[i].get(j).value);
            }
        }
        N=N*2;
    }
}
