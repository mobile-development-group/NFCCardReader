package com.mdgroup.nfccardreader;

public interface CardNfcInterface {
    void startNfcReadCard();

    void cardIsReadyToRead();

    void doNotMoveCardSoFast();

    void unknownEmvCard();

    void cardWithLockedNfc();

    void finishNfcReadCard();
}