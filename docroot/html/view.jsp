
<%@include file="/html/init.jsp" %>
<%
	String navItem = ParamUtil.getString(request, "navItem", "unused_files");
%>

<liferay-portlet:renderURL varImpl="iteratorURL"></liferay-portlet:renderURL>
<portlet:actionURL name="runJob" var="runJobUrl" ></portlet:actionURL>

<liferay-ui:error exception="<%=PrincipalException.class %>" message="delete-file-principal-exception"></liferay-ui:error>
<liferay-ui:error key="generic-error" message="generic-error-msg"></liferay-ui:error>

<aui:button href="<%=runJobUrl %>" value="run-job"/>
	<aui:nav cssClass="nav-tabs">
		

		<portlet:renderURL var="viewPendingURL">
			<portlet:param name="mvcPath" value="/html/view.jsp"/>
			<portlet:param name="navItem" value="unused_files" />
		</portlet:renderURL>

		<aui:nav-item href="<%= viewPendingURL %>" label="unused-files" selected='<%= navItem.equals("unused_files") %>' />
		<portlet:renderURL var="viewApprovedURL">
			<portlet:param name="mvcPath" value="/html/view.jsp"/>
			<portlet:param name="navItem" value="referenced_files" />
		</portlet:renderURL>

		<aui:nav-item href="<%= viewApprovedURL %>" label="referenced-files" selected='<%= navItem.equals("referenced_files") %>' />
		
	</aui:nav>
	<c:if test='<%=navItem.equals("unused_files") %>'>
		<%@include file="/html/unused_files.jspf" %>
	</c:if>
	<c:if test='<%=navItem.equals("referenced_files") %>'>
		<%@include file="/html/referenced_files.jspf" %>
	</c:if>