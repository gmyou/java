package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		
		List<Integer> lottoNum = new ArrayList<Integer>();
		
		for (int i=1; i<47; i++){
			lottoNum.add(i);
		}
		
		Collections.shuffle(lottoNum);
		
		int[] arrLottoNum = new int[6];
		
		for(int i=0; i<arrLottoNum.length; i++) {
			arrLottoNum[i] = lottoNum.get(i);
		}
		
		Arrays.sort(arrLottoNum);
		
		for(int i=0; i<6; i++) {
			System.out.println(arrLottoNum[i]);
		}
		
		System.out.println("Set");
		
		Set<Integer> set = new HashSet<Integer>();
		
		while ( set.size() < 6 ) {
			int d = (int) (Math.random() * 45 + 1);
			set.add(d);
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
