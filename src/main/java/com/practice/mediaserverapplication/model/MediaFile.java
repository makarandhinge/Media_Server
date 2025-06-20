package com.practice.mediaserverapplication.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "media_files")
public class MediaFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String fileName;
    @Column(nullable = false, unique = true)
    private String filePath;
    @Column(nullable = false)
    private String mediaType;
    @Column(nullable = false)
    private long fileSize;
    @Column(nullable = false)
    private LocalDateTime createdAt;


}
