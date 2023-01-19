package de.kaiserpfalzedv.billing.api.model.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import de.kaiserpfalzedv.billing.api.api.HasDisplayName;
import de.kaiserpfalzedv.commons.core.resources.HasName;
import de.kaiserpfalzedv.commons.core.resources.HasNameSpace;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@JsonInclude(JsonInclude.Include.NON_ABSENT)
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BaseNamedResoure extends BaseRevisionedResoure implements HasName, HasNameSpace, HasDisplayName {
    private String nameSpace;
    private String name;
}
