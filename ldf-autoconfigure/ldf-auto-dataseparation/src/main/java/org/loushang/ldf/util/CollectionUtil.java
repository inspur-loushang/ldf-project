package org.loushang.ldf.util;

import java.util.Collection;

public class CollectionUtil {
    public static boolean isNotEmpty(Collection<?> c) {
        if (c != null && c.size()>0) {
            return true;
        }
        return false;
    }
}
