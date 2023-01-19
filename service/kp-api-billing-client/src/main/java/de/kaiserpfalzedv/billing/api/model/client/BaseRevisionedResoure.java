package de.kaiserpfalzedv.billing.api.model.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import de.kaiserpfalzedv.commons.core.resources.HasRevision;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.time.OffsetDateTime;

@Jacksonized
@JsonInclude(JsonInclude.Include.NON_ABSENT)
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BaseRevisionedResoure extends BaseResoure implements HasRevision {
    private OffsetDateTime created;
    private OffsetDateTime modified;
    private OffsetDateTime revisioned;
}
