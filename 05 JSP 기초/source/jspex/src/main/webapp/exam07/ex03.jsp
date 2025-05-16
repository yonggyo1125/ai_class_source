<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:formatNumber value="1000000000" groupingUsed="false" /><br>
[0] <fmt:formatNumber value="100000000.12" pattern="#,###.00000" /><br>
[#] <fmt:formatNumber value="100000000.12" pattern="#,###.#####" /><br>
[P] <fmt:formatNumber value="0.56" type="percent" /><br>
[C] <fmt:formatNumber value="10000" type="currency" /><br>