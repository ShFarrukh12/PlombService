package com.sealService.PlombService.entitiy.lksealingentity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum InstallationType {

    MEASURING_INSTR("MI"),
    TRAFFIC_VOL_RECORD_INSTR("TVRI"),
    SPEC_TECH_MEANS("STM");

    private final String type;
    private static final Map<String, InstallationType> charMap;

    static {
        charMap = new HashMap<>();
        Arrays.stream(InstallationType.values())
                .forEach(s -> charMap.put(s.getTypeCharacters(), s));
    }

    public static InstallationType fromCharacters(String characters) {
        InstallationType type = charMap.get(characters);
        if (type == null) {
            throw new UnsupportedOperationException(
                    String.format("InstallationType '%s' is not defined", characters));
        }
        return type;
    }

    InstallationType(String type) {
        this.type = type;
    }

    public String getTypeCharacters() {
        return type;
    }

    @Converter
    public static class InstallationTypeConverter implements AttributeConverter<InstallationType, String> {

        @Override
        public String convertToDatabaseColumn(InstallationType type) {
            return type.getTypeCharacters();
        }

        @Override
        public InstallationType convertToEntityAttribute(String stringType) {
            return InstallationType.fromCharacters(stringType);
        }
    }
}

