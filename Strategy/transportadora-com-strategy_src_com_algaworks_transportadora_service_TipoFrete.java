package com.algaworks.transportadora.service;

import com.algaworks.transportadora.frete.Normal;
import com.algaworks.transportadora.frete.Sedex;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};

	public abstract Frete obterFrete();
	
}
