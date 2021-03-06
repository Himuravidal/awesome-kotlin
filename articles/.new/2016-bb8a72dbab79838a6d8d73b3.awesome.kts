
import link.kotlin.scripts.dsl.Article
import link.kotlin.scripts.dsl.LanguageCodes.EN
import link.kotlin.scripts.dsl.LinkType.article
import java.time.LocalDate

// language=Markdown
val body = """

"""

Article(
  title = "Seductive Code",
  url = "https://publicobject.com/2016/12/19/seductive-code/",
  categories = listOf(
    "Kotlin",
    "Java"
  ),
  type = article,
  lang = EN,
  author = "Jesse Wilson",
  date = LocalDate.of(2016, 12, 19),
  body = body
)
