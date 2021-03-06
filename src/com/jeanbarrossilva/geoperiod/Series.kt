package com.jeanbarrossilva.geoperiod

import com.jeanbarrossilva.geoperiod.Age.*

enum class Series(vararg ages: Age) {
    HOLOCENE(HOLOCENE_SERIES),
    PLEISTOCENE(UPPER, MIDDLE, CALABRIAN, GELASIAN),
    PLIOCENE(PIANCENZIAN, ZANCLEAN),
    MIOCENE(MESSINIAN, TORTONIAN, SERRAVALLIAN, LANGHIAN, BURDIGALIAN, AQUITANIAN),
    OLIGOCENE(CHATTIAN, RUPELIAN),
    EOCENE(PRIABONIAN, BARTONIAN, LUTETIAN, YPRESIAN),
    PALEOCENE(THANETIAN, SELANDIAN, DANIAN),
    CRETACEOUS_UPPER(MAASTRICHTIAN, CAMPANIAN, SANTONIAN, CONIACIAN, TURONIAN, CENOMANIAN),
    CRETACEOUS_LOWER(ALBIAN, APTIAN, BARREMIAN, HAUTERIVIAN, VALANGINIAN, BERRIASIAN),
    JURASSIC_UPPER(TITHONIAN, KIMMERIDGIAN, OXFORDIAN),
    JURASSIC_MIDDLE(CALLOVIAN, BATHONIAN, BAJOCIAN, AALENIAN),
    JURASSIC_LOWER(TOARCIAN, PLIENSBACHIAN, SINEMURIAN, HETTANGIAN),
    TRIASSIC_UPPER(RHAETIAN, NORIAN, CARNIAN),
    TRIASSIC_MIDDLE(LADINIAN, ANISIAN),
    TRIASSIC_LOWER(OLENEKIAN, INDUAN),
    LOPINGIAN(CHANGHSINGIAN, WUCHIAPINGIAN),
    GUADALUPIAN(CAPITANIAN, WORDIAN, ROADIAN),
    CISURALIAN(KUNGURIAN, ARTINSKIAN, SAKMARIAN, ASSELIAN),
    UPPER_PENNSYLVANIAN(GZHELIAN, KASIMOVIAN),
    MIDDLE_PENNSYLVANIAN(MOSCOVIAN),
    LOWER_PENNSYLVANIAN(BASHKIRIAN),
    UPPER_MISSISSIPPIAN(SERPUKHOVIAN),
    MIDDLE_MISSISSIPPIAN(VISEAN),
    LOWER_MISSISSIPPIAN(TOURNAISIAN),
    DEVONIAN_UPPER(FAMENNIAN, FRASNIAN),
    DEVONIAN_MIDDLE(GIVETIAN, EIFELIAN),
    DEVONIAN_LOWER(EMSIAN, PRAGIAN, LOCHKOVIAN),
    PRIDOLI(PRIDOLI_SERIES),
    LUDLOW(LUDFORDIAN, GORSTIAN),
    WENLOCK(HOMERIAN, SHEINWOODIAN),
    LLANDOVERY(TELYCHIAN, AERONIAN, RHUDDANIAN),
    ORDOVICIAN_UPPER(HIRNANTIAN, KATIAN, SANDBIAN),
    ORDOVICIAN_MIDDLE(DARRIWILIAN, DAPINGIAN),
    ORDOVICIAN_LOWER(FLOIAN, TREMADOCIAN),
    FURONGIAN(STAGE_10, JIANGSHANIAN, PAIBIAN),
    SERIES_3(GUZHANGIAN, DRUMIAN, STAGE_5),
    SERIES_2(STAGE_4, STAGE_3),
    TERRENEUVIAN(STAGE_2, FORTUNIAN),
    EDIACARAN_PERIOD(Age.EDIACARAN_PERIOD),
    CRYOGENIAN_PERIOD(Age.CRYOGENIAN_PERIOD),
    TONIAN_PERIOD(Age.TONIAN_PERIOD),
    STENIAN_PERIOD(Age.STENIAN_PERIOD),
    ECTASIAN_PERIOD(Age.ECTASIAN_PERIOD),
    CALYMMIAN_PERIOD(Age.CALYMMIAN_PERIOD),
    STATHERIAN_PERIOD(Age.STATHERIAN_PERIOD),
    OROSIRIAN_PERIOD(Age.OROSIRIAN_PERIOD),
    RHYACIAN_PERIOD(Age.RHYACIAN_PERIOD),
    SIDERIAN_PERIOD(Age.SIDERIAN_PERIOD),
    NEOARCHEAN_ERATHEM(Age.NEOARCHEAN_ERATHEM),
    MESOARCHEAN_ERATHEM(Age.MESOARCHEAN_ERATHEM),
    PALEOARCHEAN_ERATHEM(Age.PALEOARCHEAN_ERATHEM),
    EOARCHEAN_ERATHEM(Age.EOARCHEAN_ERATHEM)
}