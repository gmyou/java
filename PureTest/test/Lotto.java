package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		
		for(int i=1; i<7; i++) {
			System.out.println(arrLottoNum[i]);
		}
		
	}

}
