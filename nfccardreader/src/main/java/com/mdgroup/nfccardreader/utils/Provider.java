package com.mdgroup.nfccardreader.utils;

import static com.mdgroup.nfccardreader.utils.CardNfcUtils.LOGGER;

import android.nfc.tech.IsoDep;

import com.mdgroup.nfccardreader.enums.SwEnum;
import com.mdgroup.nfccardreader.exception.CommunicationException;
import com.mdgroup.nfccardreader.parser.IProvider;

import java.io.IOException;

public class Provider implements IProvider {

    private IsoDep mTagCom;

    public void setmTagCom(final IsoDep mTagCom) {
        this.mTagCom = mTagCom;
    }

    @Override
    public byte[] transceive(byte[] pCommand) throws CommunicationException {
        byte[] response = null;
        try {
            // send command to emv card
            response = mTagCom.transceive(pCommand);
        } catch (IOException e) {
            throw new CommunicationException(e.getMessage());
        }

        LOGGER.d("resp: " + BytesUtils.bytesToString(response));
        try {
            LOGGER.d("resp: " + TlvUtil.prettyPrintAPDUResponse(response));
            SwEnum val = SwEnum.getSW(response);
            if (val != null) {
                LOGGER.d("resp: " + val.getDetail());
            }
        } catch (Exception e) {
        }

        return response;
    }
}