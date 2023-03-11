package com.jftech.reddit.scraper.api.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(schema = "data", name = "campaign")
public class Campaign extends TemporalEntity {

    @Id
    @Column(name = "campaign_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campaign_generator")
    @SequenceGenerator(name = "campaign_generator", sequenceName = "campaign_seq")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String status;

    @OneToMany(mappedBy = "id")
    private List<CampaignOption> options;
}
