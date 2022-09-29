package com.mdgroup.nfccardreader.utils;

import static com.mdgroup.nfccardreader.utils.CardNfcUtils.LOGGER;

import com.mdgroup.nfccardreader.model.enums.IKeyEnum;

/**
 * Utils class which provided methods to manipulate Enum
 */
public final class EnumUtils {

    /**
     * Get the value of and enum from his key
     *
     * @param pKey   key to find
     * @param pClass Enum class
     * @return Enum instance of the specified key or null otherwise
     */
    @SuppressWarnings("unchecked")
    public static <T extends IKeyEnum> T getValue(final int pKey, final Class<T> pClass) {
        for (IKeyEnum val : pClass.getEnumConstants()) {
            if (val.getKey() == pKey) {
                return (T) val;
            }
        }
        LOGGER.e("Unknow value:" + pKey + " for Enum:" + pClass.getName());
        return null;
    }

    /**
     * Private constructor
     */
    private EnumUtils() {
    }
}