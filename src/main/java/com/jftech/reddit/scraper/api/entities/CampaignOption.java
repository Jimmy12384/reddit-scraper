package com.jftech.reddit.scraper.api.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(schema = "data", name = "thread")
public class CampaignOption extends TemporalEntity {

    @Id
    @Column(name = "campaign_option_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campaign_option_generator")
    @SequenceGenerator(name = "campaign_option_generator", sequenceName = "campaign_option_seq")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String status;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;
}
