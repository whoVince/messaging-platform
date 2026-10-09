# API do MVP

| Método | Endpoint | Objetivo |
| --- | --- | --- |
| POST | `/api/messages` | Enfileirar mensagem |
| GET | `/api/messages/{id}` | Consultar entrega |
| POST | `/api/messages/{id}/replay` | Reprocessar DLQ |

Mensagens retornam `202 Accepted`; entrega é assíncrona e observável pelo
estado da mensagem.
