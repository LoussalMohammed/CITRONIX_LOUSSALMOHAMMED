package org.CitronixFarm.citronix.common.mapper;

public interface BaseMapper<E, OT> {
    OT toOT(E e);
    E toE(OT ot);
}
