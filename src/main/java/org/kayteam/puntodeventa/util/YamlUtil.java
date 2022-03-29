/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kayteam.puntodeventa.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.simpleyaml.configuration.file.YamlFile;

/**
 *
 * @author segun
 */
public class YamlUtil {

    public static List<String> listFilesForFolder(final File folder) {
        List<String> folderNames = new ArrayList<>();
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                folderNames.add(fileEntry.getName());
            }
        }
        return folderNames;
    }

    public static YamlFile getFile(String path){
        YamlFile yamlFile = new YamlFile(path);
        try {
            if (!yamlFile.exists()) {
                System.out.println("New file has been created: " + yamlFile.getFilePath() + "\n");
                yamlFile.createNewFile(true);
            } else {
                System.out.println(yamlFile.getFilePath() + " already exists, loading configurations...\n");
            }
            yamlFile.load();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return yamlFile;
    }
    
}
