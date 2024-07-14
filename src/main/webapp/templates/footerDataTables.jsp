<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer class="footer">
    <%
        request.getSession().removeAttribute("mensaje");
    %>
</footer>
<script src="${pageContext.request.contextPath}/assets/js/jquery-3.7.0.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.js" ></script>
<script src="${pageContext.request.contextPath}/assets/js/datatables.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/dataTables.bootstrap5.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/es-MX.json"></script>
<script>
    document.addEventListener('DOMContentLoaded', () => {
        const table = document.getElementById('tabla_economicos');
        new DataTable(table, {
            language: {
                url: '${pageContext.request.contextPath}/JS/es-MX.json'
            },
            ajax: '${pageContext.request.contextPath}/verEconomicos',
            processing: true,
            serverSide: true,
            columns: [
                {data: 'fecha'},
                {data: 'placa'},
                {data: 'economico'},
                {data: 'cedis'},
                {data: 'region'},
                {data: 'consultar'}
            ]
        });
    });
</script>
</body>
</html>
