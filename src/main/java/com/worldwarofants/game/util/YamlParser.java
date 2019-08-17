package com.worldwarofants.game.util;

import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

/**
 * YAML Parser
 * For parsing YAML files
 */

public class YamlParser {
    Map<String, Map<String, Object>> data;

    public YamlParser(String path) {
        Yaml yaml = new Yaml();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
        this.data = yaml.load(inputStream);
    }

    public Map<String, Object> getDataByKey(String key) {
        return this.data.get(key);
    }

    public Map<String, Map<String, Object>> getAllParsedData() {
        return this.data;
    }

}