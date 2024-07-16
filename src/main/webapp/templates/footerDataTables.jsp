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
                url: '${pageContext.request.contextPath}/assets/js/es-MX.json'
            },
            ajax: '${pageContext.request.contextPath}/verEconomicos',
            processing: true,
            serverSide: true,
            columns: [
                {data: 'economico.placa'},
                {data: 'economico.id_economico'},
                {data: 'cedis.nombre_cedis'},
                {data: 'cedis.region'},
                {data: 'consultar_evaluacion'}
            ]
        });
    });
</script>
<script>
    // Delegación de eventos para los selects
    document.addEventListener('change', function(event) {
        if (event.target && event.target.classList.contains('selectWithLinks')) {
            var selectedValue = event.target.value;
            if (selectedValue) {
                window.location.href = "${pageContext.request.contextPath}/"+selectedValue;
            }
        }
    });
</script>
</body>
</html>
