package br.edu.ifsp.spo.projeto.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Region {
	private String region;

	public String getRegion(String state) {
		String[] CO = new String[]{"goiás", "amazonas", "pará", "mato grosso", "mato grosso do sul",
		"distrito federal"};
		String[] NR = new String[]{"acre","amapá","rondônia","roraima","tocantins"};
		String[] ND = new String[]{"alagoas", "bahia", "ceará", "maranhão", "piauí",
										"pernambuco", "paraíba", "rio grande do norte", "sergipe"};
		String[] SL = new String[]{"paraná", "rio grande do sul", "santa catarina"};
		String[] SD = new String[]{"espírito santo", "minas gerais", "rio de janeiro", "são paulo"};

		List<String> centroOeste = new ArrayList<>(Arrays.asList(CO));
		List<String> norte = new ArrayList<>(Arrays.asList(NR));
		List<String> nordeste = new ArrayList<>(Arrays.asList(ND));
		List<String> sul = new ArrayList<>(Arrays.asList(SL));
		List<String> sudeste = new ArrayList<>(Arrays.asList(SD));
		if(centroOeste.contains(state)) {
			this.region = "centro-oeste";
		}
		else if(norte.contains(state)) {
				this.region = "norte";
			}
		else if(nordeste.contains(state)) {
			this.region = "nordeste";
		}
		else if(sul.contains(state)) {
			region = "sul";
		}
		else if(sudeste.contains(state)) {
			region = "sudeste";
		}

		return this.region;
	}
}
