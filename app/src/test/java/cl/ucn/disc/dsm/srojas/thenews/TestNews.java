/*
 * Copyright 2021 Sebastián Rojas Rodriguez sebastian.rojas04@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.srojas.thenews;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import lombok.extern.slf4j.Slf4j;

/**
 * Test of {@link News}
 *
 * @author Sebastián Rojas
 */
@Slf4j
public final class TestNews {

    /**
     * Test the Constructor
     */
    @Test
    public void testConstructor() {

        log.debug("Testing Constructor .. ");

        // Constructor OK
        {
            News news = new News(
                    "Titulo",
                    "Fuente",
                    "Seba Rojas",
                    "https://www.noticias.ucn.cl/destacado/con-entrega-de-reconocimientos-se-desarrollo-x-encuentro-de-investigacion-ucn/",
                    "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-25-at-14.59.39.jpeg",
                    "Con una emotiva entrega de reconocimientos culminó el X Encuentro de Investigación de la Universidad Católica del Norte (UCN), evento que tradicionalmente se desarrolla todos los años y que es organizado por la Vicerrectoría de Investigación y Desarrollo Tecnológico (VRIDT) de la casa de estudios.",
                    "Con entrega de reconocimientos se desarrolló X Encuentro de Investigación UCN",
                    ZonedDateTime.now(ZoneId.of("-4"))
            );

            Assertions.assertNotNull(news, "The News was null");
            Assertions.assertNotNull(news.getId(), "The Id was null");
            Assertions.assertNotNull(news.getTitle(), "The Title was null");
            Assertions.assertNotNull(news.getSource(), "The Source was null");
            Assertions.assertNotNull(news.getAuthor(), "The Author was null");
            Assertions.assertNotNull(news.getUrl(), "The URL was null");
            Assertions.assertNotNull(news.getUrlImage(), "The URL image was null");
            Assertions.assertNotNull(news.getDescription(), "The Description was null");
            Assertions.assertNotNull(news.getContent(), "The Content was null");
            Assertions.assertNotNull(news.getPublishedAt(), "The PublishedAt was null");
        }

        // Constructor not ok
        {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                new News(
                        null,
                        "Fuente",
                        "Seba Rojas",
                        "https://www.noticias.ucn.cl/destacado/con-entrega-de-reconocimientos-se-desarrollo-x-encuentro-de-investigacion-ucn/",
                        "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-25-at-14.59.39.jpeg",
                        "Con una emotiva entrega de reconocimientos culminó el X Encuentro de Investigación de la Universidad Católica del Norte (UCN), evento que tradicionalmente se desarrolla todos los años y que es organizado por la Vicerrectoría de Investigación y Desarrollo Tecnológico (VRIDT) de la casa de estudios.",
                        "Con entrega de reconocimientos se desarrolló X Encuentro de Investigación UCN",
                        ZonedDateTime.now(ZoneId.of("-4"))
                );
            });

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                new News(
                        "Titulo",
                        null,
                        "Seba Rojas",
                        "https://www.noticias.ucn.cl/destacado/con-entrega-de-reconocimientos-se-desarrollo-x-encuentro-de-investigacion-ucn/",
                        "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-25-at-14.59.39.jpeg",
                        "Con una emotiva entrega de reconocimientos culminó el X Encuentro de Investigación de la Universidad Católica del Norte (UCN), evento que tradicionalmente se desarrolla todos los años y que es organizado por la Vicerrectoría de Investigación y Desarrollo Tecnológico (VRIDT) de la casa de estudios.",
                        "Con entrega de reconocimientos se desarrolló X Encuentro de Investigación UCN",
                        ZonedDateTime.now(ZoneId.of("-4"))
                );
            });

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                new News(
                        "Titulo",
                        "Fuente",
                        null,
                        "https://www.noticias.ucn.cl/destacado/con-entrega-de-reconocimientos-se-desarrollo-x-encuentro-de-investigacion-ucn/",
                        "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-25-at-14.59.39.jpeg",
                        "Con una emotiva entrega de reconocimientos culminó el X Encuentro de Investigación de la Universidad Católica del Norte (UCN), evento que tradicionalmente se desarrolla todos los años y que es organizado por la Vicerrectoría de Investigación y Desarrollo Tecnológico (VRIDT) de la casa de estudios.",
                        "Con entrega de reconocimientos se desarrolló X Encuentro de Investigación UCN",
                        ZonedDateTime.now(ZoneId.of("-4"))
                );
            });

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                new News(
                        "Titulo",
                        "Fuente",
                        "Seba Rojas",
                        "https://www.noticias.ucn.cl/destacado/con-entrega-de-reconocimientos-se-desarrollo-x-encuentro-de-investigacion-ucn/",
                        "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-25-at-14.59.39.jpeg",
                        null,
                        "Con entrega de reconocimientos se desarrolló X Encuentro de Investigación UCN",
                        ZonedDateTime.now(ZoneId.of("-4"))
                );
            });

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                new News(
                        "Titulo",
                        "Fuente",
                        "Seba Rojas",
                        "https://www.noticias.ucn.cl/destacado/con-entrega-de-reconocimientos-se-desarrollo-x-encuentro-de-investigacion-ucn/",
                        "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-25-at-14.59.39.jpeg",
                        "Con una emotiva entrega de reconocimientos culminó el X Encuentro de Investigación de la Universidad Católica del Norte (UCN), evento que tradicionalmente se desarrolla todos los años y que es organizado por la Vicerrectoría de Investigación y Desarrollo Tecnológico (VRIDT) de la casa de estudios.",
                        null,
                        ZonedDateTime.now(ZoneId.of("-4"))
                );
            });

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                new News(
                        "Titulo",
                        "Fuente",
                        "Seba Rojas",
                        "https://www.noticias.ucn.cl/destacado/con-entrega-de-reconocimientos-se-desarrollo-x-encuentro-de-investigacion-ucn/",
                        "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-25-at-14.59.39.jpeg",
                        "Con una emotiva entrega de reconocimientos culminó el X Encuentro de Investigación de la Universidad Católica del Norte (UCN), evento que tradicionalmente se desarrolla todos los años y que es organizado por la Vicerrectoría de Investigación y Desarrollo Tecnológico (VRIDT) de la casa de estudios.",
                        "Con entrega de reconocimientos se desarrolló X Encuentro de Investigación UCN",
                        null
                );
            });
        }


    }

}
