package tla.web.model.parts;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tla.web.model.mappings.Util;
import lombok.AllArgsConstructor;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Glyphs {

    private String unicode;

    private String mdc;

    private String svg;

    public static Glyphs of(String mdc) {
        return Glyphs.builder()
            .mdc(mdc)
            .unicode(mdc)
            .svg(Util.jseshRender(mdc))
            .build();
    }

    /**
     * Returns true if all attributes are actually empty.
     */
    public boolean isEmpty() {
        return (this.unicode == null || this.unicode.isBlank())
            && (this.mdc == null || this.mdc.isBlank());
    }

}

