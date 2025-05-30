package com.bluejnr.wiretransfer.pattern.state.impl;

import com.bluejnr.wiretransfer.exception.FinalStateException;
import com.bluejnr.wiretransfer.model.domain.WireTransferVO;
import com.bluejnr.wiretransfer.pattern.state.WireTransferState;
import com.bluejnr.wiretransfer.pattern.strategy.WireTransferStrategy;

public class SuccessfulWireTransfer extends WireTransferState {

	public SuccessfulWireTransfer(WireTransferVO wireTransferVO) {
		super(wireTransferVO);
	}

	@Override
	public void process() {
	    throw new FinalStateException("La transferencia ya se envio EXITOSAMENTE");
	}

	@Override
	public String toString() {
		return WireTransferStrategy
				.SUCCESSFUL
				.name();
	}
}
