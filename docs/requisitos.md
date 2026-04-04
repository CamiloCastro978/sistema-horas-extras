# Requisitos del sistema de horas extras

## Información general
- **Proyecto:** Sistema de registro de horas extras
- **Empresa:** BAMOCOL S.A.
- **Normativa aplicable:** Ley 2466 de 2025 · CST arts. 159–162
- **Versión:** 1.0
- **Autor:** Cristian Castro
- **Fecha:** Abril 2026

## Requisitos funcionales

| ID    | Descripción |
|-------|-------------|
| RF01  | El sistema permite registrar una hora extra indicando: empleado, fecha, hora de inicio, hora de fin y actividad realizada. |
| RF02  | El sistema clasifica automáticamente cada hora extra como diurna (6am–7pm), nocturna (7pm–6am), dominical/festiva diurna o dominical/festiva nocturna, según la Ley 2466 de 2025. |
| RF03  | El sistema detecta y muestra el porcentaje de recargo correspondiente a cada tipo de hora extra (25%, 75%, 90%, 165%). |
| RF04  | El sistema valida que un empleado no supere 2 horas extras diarias ni 12 semanales, y muestra una alerta si se acerca o supera ese límite. |
| RF05  | El sistema permite registrar, editar y eliminar empleados con sus datos: nombre, cargo, área y horario base (hora de entrada y salida). |
| RF06  | El sistema muestra el acumulado de horas extras por empleado en la semana actual y en el mes en curso, clasificado por tipo. |
| RF07  | El sistema conserva el historial completo de registros de meses anteriores y permite consultarlos por empleado y por período. |
| RF08  | El sistema genera un reporte por período (semanal o mensual) con el resumen de horas extras por empleado y por tipo, listo para entregar al liquidador. |
| RF09  | El sistema permite gestionar la lista de festivos colombianos por año, de forma que pueda actualizarse sin modificar el código. |
| RF10  | El sistema registra quién realizó cada registro (usuario supervisor) y la fecha y hora en que se hizo. |

## Requisitos no funcionales

| ID     | Descripción |
|--------|-------------|
| RNF01  | El sistema debe guardar un registro de hora extra en menos de 2 segundos. |
| RNF02  | El sistema debe funcionar en computadores con Windows 10 o superior sin instalación de software adicional por parte del usuario. |
| RNF03  | Solo usuarios con credenciales válidas pueden ingresar al sistema. La sesión debe cerrarse automáticamente tras 30 minutos de inactividad. |
| RNF04  | La interfaz debe mostrar claramente el tipo de hora extra y el acumulado semanal sin necesidad de capacitación previa para un supervisor. |
| RNF05  | El sistema debe mantener la integridad de los datos: no puede eliminarse un empleado si tiene registros de horas extras asociados. |
| RNF06  | El código fuente debe estar versionado en GitHub con commits descriptivos en cada cambio relevante. |